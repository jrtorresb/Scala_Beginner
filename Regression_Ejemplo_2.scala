

import org.apache.spark.ml.regression.LinearRegression

import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

// Pones el parentesis para escribirlo en varias lineas
val data =  (spark.read.option("header", "true")
	.option("inferSchema","true")
	.format("csv")
	.load("Clean_Ecommerce.csv"))

data.printSchema


data.head(2)


val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example Data Row")
for (ind<-Range(1,colnames.length)){
	println(colnames(ind))
	println(firstrow(ind))
	println("\n")
}



import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors 

val df = (data.select(data("Yearly Amount Spent").as("label"),
		 $"Avg Session Length", 
		 $"Time on App",
		 $"Time on Website", 
		 $"Length of Membership"))



val assembler = new VectorAssembler().setInputCols(Array("Avg Session Length", "Time on App","Time on Website", "Length of Membership")).setOutputCol("features")


val output = assembler.transform(df).select("label",$"features")

val lr =  new LinearRegression()

val lrModel = lr.fit(output)

println(s"Coeff: ${lrModel.coefficients}, intercept: ${lrModel.intercept}")

val trainingSummary =  lrModel.trainingSummary

trainingSummary.residuals.show()
println(s"RMSE: ${trainingSummary.rootMeanSquaredError}")
println(s"MSE: ${trainingSummary.meanSquaredError}")
println(s"R^^2: ${trainingSummary.r2}")



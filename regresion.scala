// Linear Regression

import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.sql.SparkSession



def main(): Unit = {

	val spark = SparkSession.builder().appName("LinearRegressionExample").getOrCreate()

	val path = "C:/Spark/data/mllib/sample_linear_regression_data.txt"

	val training = spark.read.format("libsvm").load(path)
	training.printSchema()

	val lr = new LinearRegression().setMaxIter(100).setRegParam(0.3).setElasticNetParam(0.8)

	val lrModel = lr.fit(training)


	println(s"Coefficients: ${lrModel.coefficients} Intercep: ${lrModel.intercept}")

	val trainingSummary = lrModel.summary 
	println(s"numIterations: ${trainingSummary.totalIterations}")
	println(s"objectiveHistory: ${trainingSummary.objectiveHistory.toList}")
	trainingSummary.residuals.show()
	println(s"RSM: ${trainingSummary.rootMeanSquaredError}")
	println(s"r2: ${trainingSummary.r2}")

	spark.stop()

}

main()
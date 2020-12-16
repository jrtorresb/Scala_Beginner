import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("sales.csv")

df.head(5)


for(row <- df.head(5)){
	println(row)
}




df.show()

df.printSchema()
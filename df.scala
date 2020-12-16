import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("hack_data.csv")

df.head(5)


for(row <- df.head(5)){
	println(row)
}


df.columns

df.describe().show()

df.select("Location").show()

df.select($"Location",$"Pages_Corrupted").show()

df.withColumn("Sum", df("Session_Connection_Time") + df("Kali_Trace_Used")).show()

df.show()

df.printSchema()
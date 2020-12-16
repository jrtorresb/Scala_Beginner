val x="hello"

if(x.endsWith("o")){
	println("Hola Mundo")
}


//var  rango = 1 to 10
for (n <-1 to 10 by 2){
	println(n)

}

for (num <- Range(0,101)){
	if(num%2 == 0){
		println(s"$num is even")
	}else{
		println(s"$num is odd")
	}
}


def simple(): Unit = {
	println("simple print")
}

simple()



def adder(num1:Int, num2:Int): Int = {
    return num1 + num2
}

adder(1,2)
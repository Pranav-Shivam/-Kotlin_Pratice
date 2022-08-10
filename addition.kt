fun add(a:Int,b:Int):Int
{
  var c=a+b
  return c
}
fun main()
{
  var sum=add(5,10)
  var dif=sub(10,5)
  var pro=mul(10,5)
  var divi=div(10,5)
  println("Sum is $sum")
  println("Diff is $dif")
  println("Product is $pro")
  println("Divison is $divi")
}
fun sub(a:Int,b:Int):Int
{
  var c=a-b
  return c
}
fun mul(a:Int,b:Int):Int
{
  var c=a*b
  return c
}
fun div(a:Int,b:Int):Int
{
  var c=a/b
  return c
}
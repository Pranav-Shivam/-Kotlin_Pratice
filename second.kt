class firstClass{
  private var nm:String="Pranav Shivam"
  private var a:Int=5
  private var b:Int=10
  
  fun party()
  {
    println("My name is $nm")
    var sum=a+b
    println("Sum is $sum")
  }
}
fun main()
{
  var obj=firstClass()
  obj.party()
}
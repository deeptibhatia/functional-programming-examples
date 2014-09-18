object BangBangBangString{
  def unapply(str:String):Option[String]= {
    str match {
      case s if s.startsWith("!!!") => Some(s.stripPrefix("!!!"))
      case _ => None
    }
  }
}

val str = "!!!TestItOut"
def test(str: String) = str match{
  case BangBangBangString(rest) => println(rest)
  case _ => println("Doesn't start with !!!")
}

test(str)

val myStringList = List(str, "Negative")

val output = for(BangBangBangString(rest)<-myStringList) yield rest

output
//{
//  println("rest")
//}


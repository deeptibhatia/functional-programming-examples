package deeptibhatia.math

object Prime {
  def unapply(x: Int): Option[Int] = if ((2 until math.sqrt(x).toInt).forall(x % _ != 0)) Some(x) else None
}

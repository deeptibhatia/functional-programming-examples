package deeptibhatia.math

/**
 * Created by dbhatia on 6/28/14.
 */
object LocalMath {
  def sum(seq : IndexedSeq[Int]): Long = (0L /: seq)(_+_)  // seq.foldLeft(0L)(_+_)

  def sumL(seq : IndexedSeq[Long]): Long = (0L /: seq)(_+_)  // seq.foldLeft(0L)(_+_)

  def sum(st: Stream[Int]): Long = (0L /: st)(_+_)

  def sumL(st: Stream[Long]): Long = (0L /: st)(_+_)

}

package algebra

object AbstractAlgebraFinite {
  // TASK: determine whether the given element, e, is actually
  //   the identity element for the set under the operation.
  def isIdentity[T](e: T, s: Set[T], op: (T, T) => T): Boolean = {
    s.forall{x => //e + x == x + e == x
      op(e,x) == x &&
      op(x,e) == x
    }
  }

  // TASK: search the set s for an identity element,
  //    return None if no such element exists
  //    otherwise, find e such that e is the identity,
  //    then return Some(e).  This function should make use of
  //    the isIdentity function.
  def findIdentity[T](s: Set[T], op: (T, T) => T): Option[T] = {
    // The identity is guaranteed to be unique if it exists.
    // Because if there are two identifies e1 and e2, then
    // op(e1,e2)=e1 and op(e1,e2)=e2, by definition of identity.
    // so e1=e2.
    ???
  }

  def hasIdentity[T](s: Set[T], op: (T, T) => T): Boolean = {
    // Boolean to indicate whether or not the set has an identity
    // element.
    findIdentity(s, op) != None
  }

  // TASK:  Is the given set closed under the given operation?
  //   I.e., is it true that for ever x and y in s, that
  //   op(x,y) is also in s?
  def isClosed[T](s: Set[T], op: (T, T) => T): Boolean = {
    ???
  }

  // TASK: is it true that for all a, b, and c in s, that
  //   op(op(a, b), c) == op(a, op(b, c))?
  def isAssociative[T](s: Set[T], op: (T, T) => T): Boolean = {
    ???
  }

  // Given a set and binary operation, detect exhaustively
  //   whether it is a monoid.  I.e., check all possible cases
  //   of the monoid axioms.
  def isMonoid[T](s: Set[T], op: (T, T) => T): Boolean = {
    isClosed(s, op) &&
    isAssociative(s, op) &&
    hasIdentity(s, op)
  }

  // TASK: Given a set and binary operation, detect exhaustively
  //   whether it is a group.  I.e., check all possible cases
  //   of the group axioms.   Make use of the isMonoid function.
  def isGroup[T](s: Set[T], op: (T, T) => T): Boolean = {
    // is monoid?
    // every element has inverse?
    ???
  }

  // TASK: Given a set and binary operation, detect exhaustively
  //   whether the operation is commutative
  def isAbelian[T](s: Set[T], op: (T, T) => T): Boolean = {
    ???
  }

  // TASK: Given a set and binary operation, detect exhaustively
  //   whether it is a ring.  I.e., check all possible cases
  //   of the ring axioms.  Make use of the isGroup, isAbelian, 
  //   and isMonoid functions.
  def isRing[T](s: Set[T], add: (T, T) => T, times: (T, T) => T): Boolean = {
    // does addition make an Abelian group
    // does times make a monoid
    // do (right and left) distributive laws work for ALL elements
    ???
  }

  // TASK: Given a set and binary operation, detect exhaustively
  //   whether it is a field.  I.e., check all possible cases
  //   of the field axioms.  Make use of the isRing, isAbelian, and isGroup
  //   functions.   Be careful, the set is not necessarily a group,
  //   you must test group-ness on the set minus the zero element, which
  //   you must find using the findIdentity function.
  def isField[T](s: Set[T], add: (T, T) => T, times: (T, T) => T): Boolean = {
    // Is times commutative?
    // Is s ring using add and times?
    // Is (s, times) a group if we exclude the zero (additive identity)?
    ???
  }
}

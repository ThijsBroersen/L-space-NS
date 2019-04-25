package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LendAction
    extends OntologyDef(
      iri = "http://schema.org/LendAction",
      iris = Set("http://schema.org/LendAction"),
      label = "LendAction",
      comment =
        """The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/BorrowAction">BorrowAction</a>: Reciprocal of LendAction.</li>
</ul>
""",
      `@extends` = () => List(TransferAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TransferAction.Properties {
    lazy val borrower = lspace.ns.vocab.schema.borrower.property
  }
  override lazy val properties: List[LProperty] = List(borrower)
  trait Properties extends lspace.ns.vocab.schema.TransferAction.Properties {
    lazy val borrower = lspace.ns.vocab.schema.borrower.property
  }
}

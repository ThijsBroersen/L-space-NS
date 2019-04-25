package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BorrowAction
    extends OntologyDef(
      iri = "http://schema.org/BorrowAction",
      iris = Set("http://schema.org/BorrowAction"),
      label = "BorrowAction",
      comment =
        """The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/LendAction">LendAction</a>: Reciprocal of BorrowAction.</li>
</ul>
""",
      `@extends` = () => List(TransferAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TransferAction.Properties {
    lazy val lender = lspace.ns.vocab.schema.lender.property
  }
  override lazy val properties: List[LProperty] = List(lender)
  trait Properties extends lspace.ns.vocab.schema.TransferAction.Properties {
    lazy val lender = lspace.ns.vocab.schema.lender.property
  }
}

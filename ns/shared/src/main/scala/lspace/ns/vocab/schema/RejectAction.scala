package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object RejectAction
    extends OntologyDef(
      iri = "http://schema.org/RejectAction",
      iris = Set("http://schema.org/RejectAction"),
      label = "RejectAction",
      comment =
        """The act of rejecting to/adopting an object.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/AcceptAction">AcceptAction</a>: The antonym of RejectAction.</li>
</ul>
""",
      `@extends` = () => List(AllocateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AllocateAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AllocateAction.Properties {}
}

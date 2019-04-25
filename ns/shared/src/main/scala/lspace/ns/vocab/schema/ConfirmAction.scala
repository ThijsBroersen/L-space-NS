package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ConfirmAction
    extends OntologyDef(
      iri = "http://schema.org/ConfirmAction",
      iris = Set("http://schema.org/ConfirmAction"),
      label = "ConfirmAction",
      comment =
        """The act of notifying someone that a future event/action is going to happen as expected.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/CancelAction">CancelAction</a>: The antonym of ConfirmAction.</li>
</ul>
""",
      `@extends` = () => List(InformAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InformAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.InformAction.Properties {}
}

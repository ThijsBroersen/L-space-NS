package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UnRegisterAction
    extends OntologyDef(
      iri = "http://schema.org/UnRegisterAction",
      iris = Set("http://schema.org/UnRegisterAction"),
      label = "UnRegisterAction",
      comment =
        """The act of un-registering from a service.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/RegisterAction">RegisterAction</a>: antonym of UnRegisterAction.</li>
<li><a class="localLink" href="http://schema.org/LeaveAction">LeaveAction</a>: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people.</li>
</ul>
""",
      `@extends` = () => List(InteractAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InteractAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties {}
}

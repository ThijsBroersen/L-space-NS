package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LeaveAction
    extends OntologyDef(
      iri = "http://schema.org/LeaveAction",
      iris = Set("http://schema.org/LeaveAction"),
      label = "LeaveAction",
      comment =
        """An agent leaves an event / group with participants/friends at a location.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/JoinAction">JoinAction</a>: The antonym of LeaveAction.</li>
<li><a class="localLink" href="http://schema.org/UnRegisterAction">UnRegisterAction</a>: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service.</li>
</ul>
""",
      `@extends` = () => List(InteractAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InteractAction.Properties {
    lazy val event = lspace.ns.vocab.schema.event.property
  }
  override lazy val properties: List[LProperty] = List(event)
  trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties {
    lazy val event = lspace.ns.vocab.schema.event.property
  }
}

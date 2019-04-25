package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SubscribeAction
    extends OntologyDef(
      iri = "http://schema.org/SubscribeAction",
      iris = Set("http://schema.org/SubscribeAction"),
      label = "SubscribeAction",
      comment =
        """The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.</li>
<li><a class="localLink" href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li>
<li><a class="localLink" href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li>
</ul>
""",
      `@extends` = () => List(InteractAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InteractAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties {}
}

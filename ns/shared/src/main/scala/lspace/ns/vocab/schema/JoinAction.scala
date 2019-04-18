package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object JoinAction extends OntologyDef(
        iri = "http://schema.org/JoinAction",
        iris = Set("http://schema.org/JoinAction"),
        label = "JoinAction",
        comment = """An agent joins an event/group with participants/friends at a location.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, JoinAction refers to joining a group/team of people.</li>
<li><a class="localLink" href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.</li>
<li><a class="localLink" href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates.</li>
</ul>
""",
        `@extends` = () => List(InteractAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.InteractAction.Properties{
lazy val event = lspace.ns.vocab.schema.event.property
}
override lazy val properties: List[LProperty] = List(event)
trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties{
lazy val event = lspace.ns.vocab.schema.event.property
}
}
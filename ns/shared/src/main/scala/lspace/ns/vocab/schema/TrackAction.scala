package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TrackAction
    extends OntologyDef(
      iri = "http://schema.org/TrackAction",
      iris = Set("http://schema.org/TrackAction"),
      label = "TrackAction",
      comment =
        """An agent tracks an object for updates.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.</li>
<li><a class="localLink" href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects.</li>
</ul>
""",
      `@extends` = () => List(FindAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.FindAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.FindAction.Properties {}
}

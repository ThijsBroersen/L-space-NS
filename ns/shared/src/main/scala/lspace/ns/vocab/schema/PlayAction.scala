package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PlayAction
    extends OntologyDef(
      iri = "http://schema.org/PlayAction",
      iris = Set("http://schema.org/PlayAction"),
      label = "PlayAction",
      comment =
        """The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ListenAction">ListenAction</a>: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.</li>
<li><a class="localLink" href="http://schema.org/WatchAction">WatchAction</a>: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.</li>
</ul>
""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {
    lazy val event = lspace.ns.vocab.schema.event.property
  }
  override lazy val properties: List[LProperty] = List(event)
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {
    lazy val event = lspace.ns.vocab.schema.event.property
  }
}

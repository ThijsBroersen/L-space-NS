package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FindAction
    extends OntologyDef(
      iri = "http://schema.org/FindAction",
      iris = Set("http://schema.org/FindAction"),
      label = "FindAction",
      comment =
        """The act of finding an object.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/SearchAction">SearchAction</a>: FindAction is generally lead by a SearchAction, but not necessarily.</li>
</ul>
""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {}
}

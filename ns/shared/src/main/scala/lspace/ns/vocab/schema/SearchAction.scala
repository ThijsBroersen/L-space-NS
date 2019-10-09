package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SearchAction extends OntologyDef(
        iri = "http://schema.org/SearchAction",
        iris = Set("http://schema.org/SearchAction"),
        label = "SearchAction",
        comment = """The act of searching for an object.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/FindAction">FindAction</a>: SearchAction generally leads to a FindAction, but not necessarily.</li>
</ul>
""",
        `@extends` = List(Action.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Action.Properties{
lazy val query = lspace.ns.vocab.schema.query.property
}
override lazy val properties: List[LProperty] = List(query)
trait Properties extends lspace.ns.vocab.schema.Action.Properties{
lazy val query = lspace.ns.vocab.schema.query.property
}
}
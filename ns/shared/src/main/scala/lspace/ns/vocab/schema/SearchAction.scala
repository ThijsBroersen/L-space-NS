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
        `@extends` = () => List(Action.ontology)
       ){
}
package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AcceptAction extends OntologyDef(
        iri = "http://schema.org/AcceptAction",
        iris = Set("http://schema.org/AcceptAction"),
        label = "AcceptAction",
        comment = """The act of committing to/adopting an object.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/RejectAction">RejectAction</a>: The antonym of AcceptAction.</li>
</ul>
""",
        `@extends` = () => List(AllocateAction.ontology)
       ){
}
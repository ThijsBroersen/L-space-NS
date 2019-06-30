package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GiveAction extends OntologyDef(
        iri = "http://schema.org/GiveAction",
        iris = Set("http://schema.org/GiveAction"),
        label = "GiveAction",
        comment = """The act of transferring ownership of an object to a destination. Reciprocal of TakeAction.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/TakeAction">TakeAction</a>: Reciprocal of GiveAction.</li>
<li><a class="localLink" href="http://schema.org/SendAction">SendAction</a>: Unlike SendAction, GiveAction implies that ownership is being transferred (e.g. I may send my laptop to you, but that doesn't mean I'm giving it to you).</li>
</ul>
""",
        `@extends` = () => List(TransferAction.ontology)
       ){
}
package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TakeAction extends OntologyDef(
        iri = "http://schema.org/TakeAction",
        iris = Set("http://schema.org/TakeAction"),
        label = "TakeAction",
        comment = """The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/GiveAction">GiveAction</a>: The reciprocal of TakeAction.</li>
<li><a class="localLink" href="http://schema.org/ReceiveAction">ReceiveAction</a>: Unlike ReceiveAction, TakeAction implies that ownership has been transfered.</li>
</ul>
""",
        `@extends` = () => List(TransferAction.ontology)
       ){
}
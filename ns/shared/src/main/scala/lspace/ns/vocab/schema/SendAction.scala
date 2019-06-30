package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SendAction extends OntologyDef(
        iri = "http://schema.org/SendAction",
        iris = Set("http://schema.org/SendAction"),
        label = "SendAction",
        comment = """The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ReceiveAction">ReceiveAction</a>: The reciprocal of SendAction.</li>
<li><a class="localLink" href="http://schema.org/GiveAction">GiveAction</a>: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).</li>
</ul>
""",
        `@extends` = () => List(TransferAction.ontology)
       ){
}
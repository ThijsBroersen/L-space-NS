package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReceiveAction extends OntologyDef(
        iri = "http://schema.org/ReceiveAction",
        iris = Set("http://schema.org/ReceiveAction"),
        label = "ReceiveAction",
        comment = """The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li>
<li><a class="localLink" href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).</li>
</ul>
""",
        `@extends` = () => List(TransferAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.TransferAction.Properties{
lazy val sender = lspace.ns.vocab.schema.sender.property
lazy val deliveryMethod = lspace.ns.vocab.schema.deliveryMethod.property
}
override lazy val properties: List[LProperty] = List(sender, deliveryMethod)
trait Properties extends lspace.ns.vocab.schema.TransferAction.Properties{
lazy val sender = lspace.ns.vocab.schema.sender.property
lazy val deliveryMethod = lspace.ns.vocab.schema.deliveryMethod.property
}
}
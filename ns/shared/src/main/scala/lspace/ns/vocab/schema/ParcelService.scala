package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ParcelService extends OntologyDef(
        iri = "http://schema.org/ParcelService",
        iris = Set("http://schema.org/ParcelService"),
        label = "ParcelService",
        comment = """A private parcel service as the delivery mode available for a certain offer.<br/><br/>

Commonly used values:<br/><br/>

<ul>
<li>http://purl.org/goodrelations/v1#DHL</li>
<li>http://purl.org/goodrelations/v1#FederalExpress</li>
<li>http://purl.org/goodrelations/v1#UPS</li>
</ul>
""",
        `@extends` = List(DeliveryMethod.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DeliveryMethod.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.DeliveryMethod.Properties{

}
}
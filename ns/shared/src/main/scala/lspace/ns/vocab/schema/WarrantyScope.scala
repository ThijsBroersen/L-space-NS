package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WarrantyScope extends OntologyDef(
        iri = "http://schema.org/WarrantyScope",
        iris = Set("http://schema.org/WarrantyScope"),
        label = "WarrantyScope",
        comment = """A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.<br/><br/>

Commonly used values:<br/><br/>

<ul>
<li>http://purl.org/goodrelations/v1#Labor-BringIn</li>
<li>http://purl.org/goodrelations/v1#PartsAndLabor-BringIn</li>
<li>http://purl.org/goodrelations/v1#PartsAndLabor-PickUp</li>
</ul>
""",
        `@extends` = () => List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}
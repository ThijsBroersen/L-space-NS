package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Motorcycle extends OntologyDef(
        iri = "http://schema.org/Motorcycle",
        iris = Set("http://schema.org/Motorcycle"),
        label = "Motorcycle",
        comment = """A motorcycle or motorbike is a single-track, two-wheeled motor vehicle.""",
        `@extends` = () => List(Vehicle.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Vehicle.Properties{

override lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
override lazy val purchaseDate = lspace.ns.vocab.schema.purchaseDate.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Vehicle.Properties{

override lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
override lazy val purchaseDate = lspace.ns.vocab.schema.purchaseDate.property}
}
package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BedDetails extends OntologyDef(
        iri = "http://schema.org/BedDetails",
        iris = Set("http://schema.org/BedDetails"),
        label = "BedDetails",
        comment = """An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also <a class="localLink" href="http://schema.org/BedType">BedType</a> (under development).""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val numberOfBeds = lspace.ns.vocab.schema.numberOfBeds.property
lazy val typeOfBed = lspace.ns.vocab.schema.typeOfBed.property
}
override lazy val properties: List[LProperty] = List(numberOfBeds, typeOfBed)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val numberOfBeds = lspace.ns.vocab.schema.numberOfBeds.property
lazy val typeOfBed = lspace.ns.vocab.schema.typeOfBed.property
}
}
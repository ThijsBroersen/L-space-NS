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
}
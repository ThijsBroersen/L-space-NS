package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Artery extends OntologyDef(
        iri = "http://schema.org/Artery",
        iris = Set("http://schema.org/Artery"),
        label = "Artery",
        comment = """A type of blood vessel that specifically carries blood away from the heart.""",
        `@extends` = List(Vessel.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Vessel.Properties{
lazy val arterialBranch = lspace.ns.vocab.schema.arterialBranch.property
lazy val source = lspace.ns.vocab.schema.source.property
lazy val supplyTo = lspace.ns.vocab.schema.supplyTo.property
}
override lazy val properties: List[LProperty] = List(arterialBranch, source, supplyTo)
trait Properties extends lspace.ns.vocab.schema.Vessel.Properties{
lazy val arterialBranch = lspace.ns.vocab.schema.arterialBranch.property
lazy val source = lspace.ns.vocab.schema.source.property
lazy val supplyTo = lspace.ns.vocab.schema.supplyTo.property
}
}
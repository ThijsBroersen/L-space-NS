package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LymphaticVessel extends OntologyDef(
        iri = "http://schema.org/LymphaticVessel",
        iris = Set("http://schema.org/LymphaticVessel"),
        label = "LymphaticVessel",
        comment = """A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.""",
        `@extends` = List(Vessel.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Vessel.Properties{
lazy val originatesFrom = lspace.ns.vocab.schema.originatesFrom.property
lazy val regionDrained = lspace.ns.vocab.schema.regionDrained.property
lazy val runsTo = lspace.ns.vocab.schema.runsTo.property
}
override lazy val properties: List[LProperty] = List(originatesFrom, regionDrained, runsTo)
trait Properties extends lspace.ns.vocab.schema.Vessel.Properties{
lazy val originatesFrom = lspace.ns.vocab.schema.originatesFrom.property
lazy val regionDrained = lspace.ns.vocab.schema.regionDrained.property
lazy val runsTo = lspace.ns.vocab.schema.runsTo.property
}
}
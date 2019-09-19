package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Vein extends OntologyDef(
        iri = "http://schema.org/Vein",
        iris = Set("http://schema.org/Vein"),
        label = "Vein",
        comment = """A type of blood vessel that specifically carries blood to the heart.""",
        `@extends` = () => List(Vessel.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Vessel.Properties{
lazy val drainsTo = lspace.ns.vocab.schema.drainsTo.property
lazy val regionDrained = lspace.ns.vocab.schema.regionDrained.property
lazy val tributary = lspace.ns.vocab.schema.tributary.property
}
override lazy val properties: List[LProperty] = List(drainsTo, regionDrained, tributary)
trait Properties extends lspace.ns.vocab.schema.Vessel.Properties{
lazy val drainsTo = lspace.ns.vocab.schema.drainsTo.property
lazy val regionDrained = lspace.ns.vocab.schema.regionDrained.property
lazy val tributary = lspace.ns.vocab.schema.tributary.property
}
}
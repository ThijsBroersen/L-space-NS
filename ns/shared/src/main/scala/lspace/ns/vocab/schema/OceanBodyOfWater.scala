package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OceanBodyOfWater extends OntologyDef(
        iri = "http://schema.org/OceanBodyOfWater",
        iris = Set("http://schema.org/OceanBodyOfWater"),
        label = "OceanBodyOfWater",
        comment = """An ocean (for example, the Pacific).""",
        `@extends` = List(BodyOfWater.ontology)
       ){
object keys extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
}
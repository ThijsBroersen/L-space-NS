package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LakeBodyOfWater extends OntologyDef(
        iri = "http://schema.org/LakeBodyOfWater",
        iris = Set("http://schema.org/LakeBodyOfWater"),
        label = "LakeBodyOfWater",
        comment = """A lake (for example, Lake Pontrachain).""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
object keys extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
}
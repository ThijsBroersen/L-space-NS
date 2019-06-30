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
}
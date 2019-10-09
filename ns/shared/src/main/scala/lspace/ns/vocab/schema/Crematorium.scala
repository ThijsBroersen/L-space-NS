package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Crematorium extends OntologyDef(
        iri = "http://schema.org/Crematorium",
        iris = Set("http://schema.org/Crematorium"),
        label = "Crematorium",
        comment = """A crematorium.""",
        `@extends` = List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}
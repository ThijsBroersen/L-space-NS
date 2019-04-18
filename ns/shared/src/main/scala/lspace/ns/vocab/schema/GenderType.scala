package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GenderType extends OntologyDef(
        iri = "http://schema.org/GenderType",
        iris = Set("http://schema.org/GenderType"),
        label = "GenderType",
        comment = """An enumeration of genders.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}
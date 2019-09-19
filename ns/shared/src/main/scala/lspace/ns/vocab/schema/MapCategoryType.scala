package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MapCategoryType extends OntologyDef(
        iri = "http://schema.org/MapCategoryType",
        iris = Set("http://schema.org/MapCategoryType"),
        label = "MapCategoryType",
        comment = """An enumeration of several kinds of Map.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}
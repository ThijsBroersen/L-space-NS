package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BedType extends OntologyDef(
        iri = "http://schema.org/BedType",
        iris = Set("http://schema.org/BedType"),
        label = "BedType",
        comment = """A type of bed. This is used for indicating the bed or beds available in an accommodation.""",
        `@extends` = () => List(QualitativeValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.QualitativeValue.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.QualitativeValue.Properties{

}
}
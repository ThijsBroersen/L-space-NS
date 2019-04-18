package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Atlas extends OntologyDef(
        iri = "http://schema.org/Atlas",
        iris = Set("http://schema.org/Atlas"),
        label = "Atlas",
        comment = """A collection or bound volume of maps, charts, plates or tables, physical or in media form illustrating any subject.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
}
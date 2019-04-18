package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PublicToilet extends OntologyDef(
        iri = "http://schema.org/PublicToilet",
        iris = Set("http://schema.org/PublicToilet"),
        label = "PublicToilet",
        comment = """A public toilet is a room or small building containing one or more toilets (and possibly also urinals) which is available for use by the general public, or by customers or employees of certain businesses.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}
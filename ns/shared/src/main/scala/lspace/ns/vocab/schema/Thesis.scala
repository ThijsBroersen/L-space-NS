package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Thesis extends OntologyDef(
        iri = "http://schema.org/Thesis",
        iris = Set("http://schema.org/Thesis"),
        label = "Thesis",
        comment = """A thesis or dissertation document submitted in support of candidature for an academic degree or professional qualification.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val inSupportOf = lspace.ns.vocab.schema.inSupportOf.property
}
override lazy val properties: List[LProperty] = List(inSupportOf)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val inSupportOf = lspace.ns.vocab.schema.inSupportOf.property
}
}
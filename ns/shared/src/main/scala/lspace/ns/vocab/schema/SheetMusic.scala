package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SheetMusic
    extends OntologyDef(
      iri = "http://schema.org/SheetMusic",
      iris = Set("http://schema.org/SheetMusic"),
      label = "SheetMusic",
      comment = """Printed music, as opposed to performed or recorded music.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}

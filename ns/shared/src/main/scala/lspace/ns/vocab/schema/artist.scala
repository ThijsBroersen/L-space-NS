package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object artist
    extends PropertyDef(
      iri = "http://schema.org/artist",
      iris = Set("http://schema.org/artist"),
      label = "artist",
      comment = """The primary artist for a work
    in a medium other than pencils or digital line art--for example, if the
    primary artwork is done in watercolors or digital paints.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}

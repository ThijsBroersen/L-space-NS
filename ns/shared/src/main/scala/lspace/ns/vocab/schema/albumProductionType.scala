package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object albumProductionType
    extends PropertyDef(
      iri = "http://schema.org/albumProductionType",
      iris = Set("http://schema.org/albumProductionType"),
      label = "albumProductionType",
      comment = """Classification of the album by it's type of content: soundtrack, live album, studio album, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(MusicAlbumProductionType.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}

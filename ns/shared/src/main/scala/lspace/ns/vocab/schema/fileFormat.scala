package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fileFormat
    extends PropertyDef(
      iri = "http://schema.org/fileFormat",
      iris = Set("http://schema.org/fileFormat"),
      label = "fileFormat",
      comment =
        """Media type, typically MIME format (see <a href="http://www.iana.org/assignments/media-types/media-types.xhtml">IANA site</a>) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}

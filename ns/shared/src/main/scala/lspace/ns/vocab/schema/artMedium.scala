package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object artMedium
    extends PropertyDef(
      iri = "http://schema.org/artMedium",
      iris = Set("http://schema.org/artMedium"),
      label = "artMedium",
      comment =
        """The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)""",
      `@extends` = () => List(material.property),
      `@range` = () => List(URL.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.material.Properties
}

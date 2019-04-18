package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object commentCount
    extends PropertyDef(
      iri = "http://schema.org/commentCount",
      iris = Set("http://schema.org/commentCount"),
      label = "commentCount",
      comment =
        """The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.""",
      `@extends` = () => List(),
      `@range` = () => List(Integer.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}

package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationDateVersion
    extends PropertyDef(
      iri = "http://schema.org/legislationDateVersion",
      iris = Set("http://schema.org/legislationDateVersion"),
      label = "legislationDateVersion",
      comment =
        """The point-in-time at which the provided description of the legislation is valid (e.g. : when looking at the law on the 2016-04-07 (= dateVersion), I get the consolidation of 2015-04-12 of the "National Insurance Contributions Act 2015")""",
      `@extends` = () => List(),
      `@range` = () => List(`@date`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}

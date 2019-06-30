package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReserveAction extends OntologyDef(
        iri = "http://schema.org/ReserveAction",
        iris = Set("http://schema.org/ReserveAction"),
        label = "ReserveAction",
        comment = """Reserving a concrete object.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ScheduleAction">ScheduleAction</a></a>: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation.</li>
</ul>
""",
        `@extends` = () => List(PlanAction.ontology)
       ){
}
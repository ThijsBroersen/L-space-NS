package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ScheduleAction extends OntologyDef(
        iri = "http://schema.org/ScheduleAction",
        iris = Set("http://schema.org/ScheduleAction"),
        label = "ScheduleAction",
        comment = """Scheduling future actions, events, or tasks.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ReserveAction">ReserveAction</a>: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation.</li>
</ul>
""",
        `@extends` = List(PlanAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PlanAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.PlanAction.Properties{

}
}